
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp" %>
<html>
<head>
    <title>Escrever Postagem</title>
</head>
<body>
<div class="container">
    <form class="baseForm" action="postar" method="post">
        <div class="dados">
            <label class="formLabel" id="titulo">
                <input name="titulo" placeholder="Título" type="text" required class="formInput formTextInput">
            </label>
            <label class="formLabel" id="texto">
                <input name="texto" placeholder="Texto" type="text" required class="formInput formTextInput">
            </label>
            <div class="botao">
                <input class="btn" value="PUBLICAR" id="btnPubli" type="submit">
            </div>
        </div>
    </form>
</div>

<style>
    body {
        background-color: gray;
    }

    input[type=text]{
        width: 80%;
        padding: 12px 20px;
        display: block;
        border: 1px solid black;
        box-sizing: border-box;
        margin: 1em 0 0 3em;
    }


    button:hover {
        opacity: 0.8;
    }

    #btnPubli {
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
        width: 5em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        margin: 2em 0 0 11em;
    }

    .container {
        border: 1px solid black;
        width: 30em;
        height: 15em;
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
