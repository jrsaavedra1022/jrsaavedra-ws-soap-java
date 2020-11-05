
package com.jrsaavedra.wsexample.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jrsaavedra.wsexample.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUser_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getUser");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getUserResponse");
    private final static QName _GetListUsers_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getListUsers");
    private final static QName _GetMessageResponse_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getMessageResponse");
    private final static QName _GetMessage_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getMessage");
    private final static QName _GetListUsersResponse_QNAME = new QName("http://ws.wsexample.jrsaavedra.com/", "getListUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jrsaavedra.wsexample.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetListUsersResponse }
     * 
     */
    public GetListUsersResponse createGetListUsersResponse() {
        return new GetListUsersResponse();
    }

    /**
     * Create an instance of {@link GetListUsers }
     * 
     */
    public GetListUsers createGetListUsers() {
        return new GetListUsers();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getListUsers")
    public JAXBElement<GetListUsers> createGetListUsers(GetListUsers value) {
        return new JAXBElement<GetListUsers>(_GetListUsers_QNAME, GetListUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.wsexample.jrsaavedra.com/", name = "getListUsersResponse")
    public JAXBElement<GetListUsersResponse> createGetListUsersResponse(GetListUsersResponse value) {
        return new JAXBElement<GetListUsersResponse>(_GetListUsersResponse_QNAME, GetListUsersResponse.class, null, value);
    }

}
