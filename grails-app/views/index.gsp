<html>
<head>
    <title>Polyglot Grails Deo</title>
</head>

<body>
<h1>Available Controllers:</h1>
<ul>
    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName }}">
        <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
    </g:each>
</ul>
</body>
</html>
