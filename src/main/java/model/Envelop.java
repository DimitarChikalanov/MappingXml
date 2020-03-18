package model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@JacksonXmlRootElement(localName = "Envelop")
@XmlAccessorType(XmlAccessType.FIELD)
public class Envelop {

    @JacksonXmlProperty(localName = "Body")
    private Body body;

    public Envelop() {
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
