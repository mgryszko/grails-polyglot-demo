<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>
<h1>Most popular tags:</h1>
<ul>
    <g:each var="tags" in="${mostPopularTags}">
        <li>${tags.value} : ${tags.key}</li>
    </g:each>
</ul>

<h1>Notes</h1>
<g:each var="note" in="${notes}">
    <p><code>${note.content}</code></p>
    ${note.tags?.join(',')}
</g:each>

<h1>Add a note</h1>
<g:form action="add">
    <g:textArea name="content" rows="10" cols="80"/>
    <br/>
    <input type="text" name="tags"/>
    <g:submitButton name="add"/>
</g:form>
</body>
</html>