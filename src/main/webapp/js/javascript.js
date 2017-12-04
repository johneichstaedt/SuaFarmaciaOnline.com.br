//jQuery
$(document).ready(function(){


});

$(function(){

  //Script para rodar slideshow
  $('#containerSlide img:eq(0)').addClass("ativo").show();
  var texto = $(".ativo").attr("text");
  var titulo = "SUA FARMÁCIA ON-LINE";
  $("#containerSlide").prepend("<p>"+texto+"</p>");
  $("#containerSlide").prepend("<h1>"+titulo+"</h1>");
  setInterval(slide,4000);//Temporizador de 4 segundos



  function slide(){
    if ($('.ativo').next().length){

          $('.ativo').fadeOut().removeClass('ativo').next().fadeIn().addClass('ativo');

      }else{
            $('.ativo').fadeOut().removeClass("ativo");
            $('#containerSlide img:eq(0)').addClass("ativo").show();
      }
          var texto = $(".ativo").attr("text");
          $('#containerSlide p').hide().html(texto).delay(500).fadeIn();
  }

});

//javaScript
/*
  Início do código para validar formulário de cadastro de usuário
*/
function abrirPopUpCadUs(){
  var validacao = valida_formCadUs ();
  if(validacao){
    newpopupWindow = window.open ('sucesso_cadastro_usuario.html','pagina',"width=1200 height=570, top=90, left=110");
    limparCampos();
  }
}

function fechaPopUpCadUs(){
    window.close();
    opener.location.href="cadastro_farmacia.html";
}

function valida_formCadUs (){
  if(document.getElementById("nomeCompleto").value == ""){
      document.getElementById("nomeCompleto").focus();
      return false
    }else if(document.getElementById("dataNascimento").value == ""){
        document.getElementById("dataNascimento").focus();
        return false
      }else if(document.getElementById("pessoaFisica").value == ""){
          document.getElementById("pessoaFisica").focus();
          return false
        }else if(document.getElementById("registroGeral").value == ""){
            document.getElementById("registroGeral").focus();
            return false
          }else if(document.getElementById("e-mail").value == ""){
              document.getElementById("e-mail").focus();
              return false
            }else if(document.getElementById("telefone").value == ""){
                document.getElementById("telefone").focus();
                return false
              }else if(document.getElementById("senhaUs").value == ""){
                  document.getElementById("senhaUs").focus();
                  return false
                }else{
                    return true;
                }
}
/*
  Fim do Código para validar formulário de cadastro de usuário
*/

/*
  Início do código para limpar formulário de cadastro de usuário
*/

function limpaTudo(){
  document.getElementById('nomeCompleto').value="";
  document.getElementById('dataNascimento').value="";
  document.getElementById('pessoaFisica').value="";
  document.getElementById('registroGeral').value="";
  document.getElementById('e-mail').value="";
  document.getElementById('telefone').value="";
  document.getElementById('senhaUs').value="";

}

function limparCampos(){
  if(document.getElementsByClassName('entrada').value!="") {
    limpaTudo();
  }
}

/*
  Fim do código para limpar formulário de cadastro de usuário
*/


/*
  Início do código para validar e-mail da página de relativa ao esquecimento de senha
*/
function abrirPopUpPassword(){
  var validacao = valida_formPassword();
  if(validacao){
    newpopupWindow = window.open ('email_enviado.html','pagina',"width=1080 height=550, top=100, left=180");
    limparEmail();
  }
}



function fechaPopUpES(){
  window.close();
  opener.location.href="index.html";
}

function valida_formPassword (){
   if(document.getElementById("e-mailEs").value == ""){
      document.getElementById("e-mailEs").focus();
      return false
      }else{
        return true;
      }
}
/*
  Fim do código para validar e-mail da página de relativa ao esquecimento de senha
*/


/*
  Início do código para limpar formulário de cadastro de recuperação de senha
*/
function limpaEmail(){
  document.getElementById('e-mailEs').value="";
}

function limparEmail(){
  if(document.getElementsByClassName('entrada').value!="") {
    limpaEmail();
  }
}
/*
  Fim do código para limpar formulário de cadastro de recuperação de senha
*/

//###############################################################################

/*
  Início do código para validar formulário de cadastro de cliente
*/
function abrirPopUpCadCl(){
  var validacao = valida_formCadCl();
  if(validacao){
    newpopupWindow = window.open ('sucesso_cadastro_cliente.html','pagina',"width=1200 height=550, top=100, left=115");
    limparCamposCl();
  }
}

function fechaPopUpCadCl(){
    window.close();
    opener.location.href="cadastro_cliente.html";
}

function valida_formCadCl (){
  if(document.getElementById("nomeCompletoCliente").value == ""){
      document.getElementById("nomeCompletoCliente").focus();
      return false
    }else if(document.getElementById("dataNascimentoCliente").value == ""){
        document.getElementById("dataNascimentoCliente").focus();
        return false
      }else if(document.getElementById("pessoaFisicaCliente").value == ""){
          document.getElementById("pessoaFisicaCliente").focus();
          return false
        }else if(document.getElementById("e-mailCliente").value == ""){
              document.getElementById("e-mailCliente").focus();
              return false
            }else if(document.getElementById("telefoneCliente").value == ""){
                document.getElementById("telefoneCliente").focus();
                return false
              }else if(document.getElementById("envioPromocoes").checked==false){
                  document.getElementById("envioPromocoes").focus();
                  return false
              }else{
                  return true;
                }
}
/*
  Fim do Código para validar formulário de cadastro de cliente
*/

/*
  Início do código para limpar formulário de cadastro do cliente
*/

function limpaTudoClientes(){
  document.getElementById('nomeCompletoCliente').value="";
  document.getElementById('dataNascimentoCliente').value="";
  document.getElementById('pessoaFisicaCliente').value="";
  document.getElementById('e-mailCliente').value="";
  document.getElementById('telefoneCliente').value="";
  document.getElementById('envioPromocoes').checked=false;

}

function limparCamposCl(){
  if(document.getElementsByClassName('entradaCliente').value!="") {
    limpaTudoClientes();
  }
}

/*
  Fim do código para limpar formulário de cadastro do cliente
*/

/*
  Início do código para validar formulário de cadastro de farmácia
*/
function abrirPagTemplate(){
  var validacao = valida_formCadFarm();
  if(validacao){
    window.location.replace("escolha_template.html");
  }
}

function valida_formCadFarm (){
  if(document.getElementById("nomeFantasia").value == ""){
      document.getElementById("nomeFantasia").focus();
      return false
    }else if(document.getElementById("razaoSocial").value == ""){
        document.getElementById("razaoSocial").focus();
        return false
      }else if(document.getElementById("cnpj").value == ""){
          document.getElementById("cnpj").focus();
          return false
        }else if(document.getElementById("inscricaoEstadual").value == ""){
            document.getElementById("inscricaoEstadual").focus();
            return false
          }else if((document.getElementById("checkPagamentoCartao").checked==false) && (document.getElementById("checkPagamentoBoleto").checked==false)){
              document.getElementById("checkPagamentoCartao").focus();
              return false
            }else if((document.getElementById("checkPagamentoCartao").checked==true) && (document.getElementById("checkPagamentoBoleto").checked==true)){
                  alert("Escolha somente uma forma de pagamento");
                  return false
              }else{
                return true;
               }
}
/*
  Fim do Código para validar formulário de cadastro de farmácia
*/

/*
  Início do código para limpar formulário de cadastro de farmácia
*/

function limpaTudoFarm(){
  document.getElementById('nomeFantasia').value="";
  document.getElementById('razaoSocial').value="";
  document.getElementById('cnpj').value="";
  document.getElementById('inscricaoEstadual').value="";
  document.getElementById('checkPagamentoCartao').checked=false;
  document.getElementById('checkPagamentoBoleto').checked=false;

}

function limparCamposFarm(){
  if(document.getElementsByClassName('entradaFarmacia').value!="") {
    limpaTudoFarm();
  }
}

/*
  Fim do código para limpar formulário de cadastro de farmácia
*/

/*####################################################################################

  Início do código para validar formulário de cadastro de produto

*/
function cadastraProduto(){
  var validacao = valida_formCadProd ();
  if(validacao){
    window.location.replace("cadastro_produto.html");
  }
}

function calculaPrecoVenda(){
  var precoCompra = parseFloat(document.getElementById('precoCompra').value);
  var lucro = parseFloat((document.getElementById('lucro').value)/100)*precoCompra;
  var precoVenda = (precoCompra+lucro)
  document.getElementById('precoVenda').value=precoVenda;
}

function valida_formCadProd (){
  if(document.getElementById("descricaoProduto").value == ""){
      document.getElementById("descricaoProduto").focus();
      return false
    }else if(document.getElementById("marca").value == ""){
        document.getElementById("marca").focus();
        return false
      }else if(document.getElementById("precoCompra").value == ""){
          document.getElementById("precoCompra").focus();
          return false
        }else if(document.getElementById("lucro").value == ""){
            document.getElementById("lucro").focus();
            return false
          }else if(document.getElementById("precoVenda").value == ""){
              document.getElementById("precoVenda").focus();
              return false
              }else{
                  return true;
                }
}

/*

  Fim do código para validar formulário de cadastro de produto

*/

/*
  Início do código para limpar formulário de cadastro de produto
*/

function limpaTudoProd(){
  document.getElementById('descricaoProduto').value="";
  document.getElementById('marca').value="";
  document.getElementById('precoCompra').value="";
  document.getElementById('lucro').value="";
  document.getElementById('precoVenda').value="";
}

function limparCamposProd(){
  if(document.getElementsByClassName('entradaProduto').value!="") {
    limpaTudoProd();
  }
}

/*
  Fim do código para limpar formulário de cadastro de produto
*/


/*
  Página template
*/

function abrirPopUpTemplates(){

  $( "#templateA,#templateB,#templateC" ).click(function() {
      var newpopupWindow;
      newpopupWindow = window.open ('sucesso_cadastro_finalizado.html','pagina',"width=1200 height=570, top=90, left=110");
  });

}

function fechaPopUpTemplate(){
    window.close();
    opener.location.href="admin_dashboard.html";
}
