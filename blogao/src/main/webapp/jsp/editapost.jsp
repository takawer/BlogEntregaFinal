<%@ page import="modelo.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp"%>
<html>
<head>
    <title>Editar postagem</title>
</head>
<body>
<div id="box" class="container">
    <form  action="atualiza" method="post">
        <div class="dados">
            <input hidden name="id" value=<%=postagemalterar.getId()%>>
            <input name="nome" placeholder="Nome" type="text" value=<%=postagemalterar.getTitulo()%>>
            <input name="login" placeholder="Login" type="text" value=<%=postagemalterar.getTexto()%>>
            <div class="botao" id="btn1">
                <input class="btn" value="SALVAR" id="btnSalv" type="submit">
            </div>
        </div>
    </form>
</div>


<style>
    body {
        background-color: gray;
    }

    input[type=text], input[type=password], input[type=email] {
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

    #btnDel, #btnSalv {
        background: transparent;
        border: none;
        color: darkgoldenrod;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    #btn1{
        position: absolute;
        margin: 2em 2em;

    }

    #btn2{
        position: absolute;
        margin: 1em 0 5em 25em;
    }




    div.botao {
        background: black;
        width: 5em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        margin: 0 0 0 13em;
    }

    .container {
        border: 1px solid black;
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
