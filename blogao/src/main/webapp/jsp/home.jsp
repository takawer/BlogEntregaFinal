<%@ page import="jpa.PostagemJPA" %>
<%@ page import="modelo.Postagem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.mysql.cj.xdevapi.Collection" %>
<%@ page import="java.util.Collections" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="nav.jsp" %>
<%
    String parecer = (String) request.getAttribute("parecer");
    PostagemJPA postagem = new Postagem();
    List<Postagem> postagens = postagem.achaTodas();
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Collections.reverse(postagens);
%>
<html>
<head>
    <title>Página Inicial</title>
    <link rel="stylesheet" type="text/css" href="/css/estiloHome.css">
    <meta CHARSET="UTF-8">
</head>

<body>
<div id="teste">
    <div class="texto"> <h4><b>  Postagens </b></h4>  </div>
</div>
<div id="postagens">
    <%for (Postagem postagem1 : postagens) {%>
    <div class="postagem">
        <form id=<%=postagem1.getId()%>, action="mostrapostagem" method="post">
            <div >
                <h5><%=postagem1.getDataDiaMes()%></h5>
            </div>
            <h3><%=postagem1.getTitulo().toUpperCase()%>
            </h3>
            <label class="formLabel">
                <input name="postId" hidden value=<%=postagem1.getId()%>>
            </label>
            <div class="botao">
                <input class="btn" value="LER" id="ler" type="submit">
            </div>
        </form>
    </div>
    <%}%>
</div>

<style>
    body {
        margin: 0;
        background-color: white;

    }
    @media screen and (min-width: 600px) {
        div.texto {
            font-size: 35px;
        }
    }

    @media screen and (max-width: 600px) {
        div.texto {
            font-size: 25px;
        }
    }


    form {
        display: flex;
    }

    form h5 {
        background: transparent;
        color: black;
        font-size: 15px;
        text-align: center;
        width: 100%;
        height: 100%;
    }



    form h3 {
        background-color: white;
        color: darkgoldenrod;
        text-align: center;
        font-size: 24px;
        padding: 0.5px;
        border: 1px solid black;

    }

    form h4 {
        background-color: white;
        color: darkgoldenrod;
        text-align: center;
        font-size: 24px;
        padding: 0.5px;
        border: 1px solid black;

    }

    #ler {
        background: transparent;
        border: none;
        color: darkgoldenrod;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    #del {
        background: transparent;
        border: none;
        color: white;
        width: 100%;
        height: 100%;
        cursor: pointer;
        font-weight: bold;
    }

    div.botao {
        background: black;
        width: 3em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        justify-content: center;
        align-items: center;
        horiz-align: center;
        margin: 1.5em 0 0 1em ;
    }

    div#postagens{
        position: center;
        width: fit-content;
        height: fit-content;
        margin: auto;
        background: gray;
        display: block;
        justify-content: center;
        align-items: center;
        alignment: center;


    }
    div#teste {
        position: center;
        width: fit-content;
        height: fit-content;
        margin: auto;
        background: darkgray;
        display: block;
        justify-content: center;
        align-items: center;
        alignment: center;


    }





    .postagem , .texto {
        width: fit-content;
        background: transparent;
        display: flex;
        align-content: center;
        align-items: center;

    }

</style>

</body>
</html>