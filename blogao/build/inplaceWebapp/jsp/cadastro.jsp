
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp" %>
<html>
<head>
    <title>Cadastro</title>

</head>
<body>
<div class="container">
    <form class="baseForm" action="cadastro" method="post">
        <div class="dados">
            <label class="formLabel">
                <input name="nomeUsuario" placeholder="Nome" type="text" required class="formInput formTextInput">
            </label>

            <label class="formLabel">
                <input name="apelidoUsuario" placeholder="Apelido" type="text" required class="formInput formTextInput">
            </label>

            <label class="formLabel">
                <input name="emailUsuario" placeholder="Email" type=email required class="formInput formTextInput">
            </label>

            <label class="formLabel">
                <input name="senha" placeholder="Senha" type="password" required class="formInput formTextInput">
            </label>
            <div class="botao">
                <input class="btn" value="CADASTRO" id="btnCad" type="submit">
            </div>
        </div>
    </form>
</div>

<style>
    body {
        background-color: gray;
    }

    input[type=text], input[type=password], input[type=email] {
        width: 70%;
        padding: 12px 20px;
        display: block;
        border: 1px solid black;
        box-sizing: border-box;
        margin: 1em 0 0 5em;
    }


    .formLabel {
        margin: 0 0 0 2em;
    }

    #btnCad {
        background: transparent;
        border: none;
        color: darkgoldenrod;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    div.dados {
        margin: 2em;
    }

    div.botao {
        background: black;
        width: 6em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        margin: 1em 0 0 5em;
    }

    button:hover {
        opacity: 0.8;
    }

    .container {
        width: 30em;
        height: 20em;
        background: white;
        display: block;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        margin: 8em 0 0 25em;
    }
</style>

</body>
</html>