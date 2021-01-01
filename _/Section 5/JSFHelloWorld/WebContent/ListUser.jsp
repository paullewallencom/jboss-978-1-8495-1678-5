<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
 
<html>
<head>
    <title>Hello Users</title>
</head>
<body>
<f:view>
    <h:messages>
        <h:outputText value="HELLO !! #{helloBean.name}" style="font-size:22px;"></h:outputText>
        <h3> Welcome to Roseindia !!</h3>
    </h:messages>
</f:view>
</body>
</html>