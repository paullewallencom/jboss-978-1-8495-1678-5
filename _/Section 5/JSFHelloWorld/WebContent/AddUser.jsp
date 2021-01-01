<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
 
<html>
<head>
    <title>Add New User Form</title>
</head>
<body>
<f:view>
        <p>
            <h:message id="errors" for="User_ID" style="color:red"/>
        </p>
    <h:form>
        <h:panelGrid border="1" columns="1">
            <h:outputText value="Name"></h:outputText>
            <h:inputText value="#{helloBean.name}"></h:inputText>
            <h:commandButton action="#{helloBean.addUser}"
                value="Add Customer"></h:commandButton>
        </h:panelGrid>
    </h:form>
</f:view>
</body>
</html>