<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>
<g:form action="route">
    <g:select name="start" from="${cities}" value="${params.start}"/>
    <g:select name="dest" from="${cities}" value="${params.dest}"/>
    <g:submitButton name="Calculate"/>

    <g:if test="${route}">
        <p>
            Shortest route between ${params.start} and ${params.dest}: <g:join in="${route}" delimiter=" - "/>
        </p>
    </g:if>
</g:form>

<g:img id="map" file="map.jpg" width="100%"/>

</body>
</html>