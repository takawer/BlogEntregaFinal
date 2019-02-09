<%@ page import="javafx.geometry.Pos" %>
<%@ page import="modelo.*" %>
<%@ page import="java.util.List" %>
<%@include file="nav.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Postagem postagem = (Postagem) request.getAttribute("postagem");
    List<Comentario> comentarios = postagem.getComentarios();
    session.setAttribute("postagem", postagem);
    if (usuario == null) {
        usuario = new Usuario();
    }

%>



<html>
<head>
    <title>Postagem</title>
</head>
<body>

<div class="container">

    <div id="post">
        <h1 id="titulo"><%=postagem.getTitulo().toUpperCase()%>
        </h1>
        <h6 id="data"><%=postagem.getData()%>
        </h6>
        <p id="texto"><%=postagem.getTexto()%>
        </p>


        <%if(eadmin && comentarios.isEmpty()) {
            System.out.println("eadmin?: " + eadmin);%>
        <div class="postagem">
            <form id=<%=postagem.getId()%>, action="delpost" method="post">
                <label class="formLabel">
                    <input name="postId" hidden value=<%=postagem.getId()%>>
                </label>
                <div class="botao">
                    <input class="btn" value="DELETAR" id="btnDel" type="submit">
                </div>
            </form>
            <form id=<%=postagem.getId()%>, action="editp">
                <label class="formLabel">
                    <input name="postId" hidden value=<%=postagem.getId()%>>
                </label>
                <div class="botao">
                    <input class="btn" value="EDITAR" id="btnEditar" type="submit">
                </div>
            </form>

        </div>
        <%}%>
    </div>




</div>
<div class="container">
<div id="comentar">
    <h1>Comentários:</h1>
    <%if (usuario.getId() != null) {%>
    <form id="cont" action="comentar" method="post">

        <label class="formLabel">
            <input name="nomeUsuario" disabled value=<%=usuario.getNome()%>, type="text" required>
        </label>

        <label class="formLabel">
            <input name="comentario" placeholder="Comentário" type="text" required>
        </label>

        <label class="formLabel">
            <input name="idUsuario" hidden value=<%=usuario.getId()%>>
        </label>

        <label class="formLabel">
            <input name="idPostagem" hidden value=<%=postagem.getId()%>>
        </label>
        <div class="botao">
            <input class="btn" value="COMENTAR" id="btnCom" type="submit">
        </div>

    </form>
    <%}%>


    <%
        if (!comentarios.isEmpty()) {
            for (Comentario comentario : comentarios) {
    %>
    <div id="comentario">
        <div id="autor">
            <h4><%=usuario.achaUsuarioPorId(comentario.getUsuario()).getNome() + " : " + comentario.getData() %>
            </h4>
            <div id="conteudo">
                <h3><%=comentario.getConteudo()%>
                </h3>
            </div>
        </div>
        <%if(eadmin) {
            System.out.println("eadmin?: " + eadmin);%>
        <form id="top" action="delcom" method="post">
            <input hidden name="comid" value=<%=comentario.getId()%>>
            <div class="botao">
                <input class="btn" value="DELETAR" id="btnDel2" type="submit">
            </div>
        </form>
        <%}%>
    </div>

    <%}%>
    <%} else { %>
    <h2>Não há nenhum comentário até o momento</h2>
    <%}%>
</div>
</div>


<style>
    body {
        background-color: gray;
    }

    .container {
        width: 100%;
        height: 100%;
        background: white;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;

    }

    form#cont {
        display: inline-block;
    }

    #btnCom, #btnDel , #btnDel2 , #btnEditar{
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

    input[type=text], input[type=password] {
        background: transparent;
        width: 40%;
        padding: 12px 20px;
        display: inline-block;
        border: 1px solid black;
        box-sizing: border-box;
        margin: 0 0 0 1em;
    }

    div.botao {
        background: black;
        width: 9em;
        height: 2em;
        border-radius: 5px;
        text-align: center;
        margin: 0 0 0 19.5em;
    }

    #post {
        background-color: gray;
        width: 50%;
        height: 100%;
        text-align: center;
    }

    h1 {
        background-color: black;
        color: darkgoldenrod;
        margin: 1em;
    }

    p {
        margin: 20px;
        text-align: justify;
        font-size: 24px;
    }

    #comentar {
        text-align: center;
        width: 50%;
        height: 100%;
        background-color: rgba(0, 0, 0, 0.3);
        display: inline-block;
        flex-direction: row;
        justify-content: center;
        align-items: center;
    }

    #comentario {
        text-align: justify;
        width: 80%;
        margin: 0 0 0 5em;
        border: 1px solid black;

    }

    #comentario h6 {
        margin: 2em 1em;

    }

    h3 {
        background-color: rgba(0, 0, 0, 0.3);
        padding: 0.5em;
    }

    h4 {
        color: darkgoldenrod;
        margin: 1em 0 0 1em;
    }

    #comentario h3 {
        margin: 1em 3em;
    }


</style>

</body>
</html>
