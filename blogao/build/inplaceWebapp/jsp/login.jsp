
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp" %>

<%
    String contexto = request.getContextPath();
    if (!contexto.equals("")) contexto = contexto + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<div class="container">
    <form class="baseForm" action="validador" method="post">

        <div class="dados">
            <label class="formLabel">
                <input name="nomeUsuario" placeholder="Apelido" type="text" required class="formInput formTextInput">
            </label>
            <label class="formLabel">

                <input name="senha" placeholder="Senha" type="password" required class="formInput formTextInput">
            </label>
            <div class="botao">
                <input class="btn" value="ENTRAR" id="btnLog" type="submit">
            </div>
        </div>

    </form>
</div>


<style>
    body {
        background-color: gray;
    }

    input[type=text], input[type=password] {
        width: 70%;
        padding: 12px 20px;
        display: block;
        border: 1px solid black;
        box-sizing: border-box;
        margin: 0 0 0 3em;
    }

    #btnLog {
        background: transparent;
        border: none;
        color: darkgoldenrod;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    div.dados{
        margin: 2em;
    }

    div.botao {
        background: black;
        width: 6em;
        height: 3em;
        border-radius: 5px;
        text-align: center;
        margin: 5em 0 0 7em;
    }

    .formLabel {
        margin: 0 0 0 2em;
    }

    button:hover {
        opacity: 0.8;
    }

    .container {
        border: 1px solid black;
        width: 25em;
        height: 20em;
        background: white;
        display: block;
        margin: 8em 0 0 30em;
    }
</style>
</body>
</html>
