<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp" %>
<%List<Usuario> usuarios = usuario.achaTodos();%>
<html>
<head>
    <title>Gerenciar</title>
</head>
<body>
<div id="usuarios">
    <%for (Usuario usuario1 : usuarios) {%>
    <div id="usuario">
        <form action="editar">
            <input name="usuarioId" hidden value=<%=usuario1.getId()%>>
            <h3><%=usuario1.getNome().toUpperCase()%></h3>
            <div class="botao">
                <input class="btn" value="EDITAR" id="btnEditar" type="submit">
            </div>

        </form>
    </div>
    <%}%>
</div>

<style>
    body {
        background-color: gray;
    }

    #usuarios {
        width: 50%;
        height: 100%;
        background: white;
        display: block;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        position: center;
        margin: auto;
    }

    #usuario {
        display: inline-block;
        background-color: white;
        width: 20%;
        height: 10%;
        justify-content: center;
        border: 1px solid black;
        position: center;
        margin: 1em;
    }

    h3 {
        text-align: center;
        font-size: 10px;
    }

    #btnEditar {
        background: transparent;
        border: none;
        color: darkgoldenrod;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    div.botao {
        background: black;
        width: 4em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        margin: 0 0 30em 2.7em;
    }

</style>

</body>
</html>
