var text_area = document.getElementById('dc-input');
var texto_criptografado = ""
var texto_descriptografado = ""

window.onload = function() {
    document.getElementById("dc-input").value = "";
} 


function criptografar(texto) {
    const campo_resultado = document.getElementsByClassName("campo-resultado");
    const img_404 = document.getElementsByClassName("img-404");
    const not_found = document.getElementsByClassName("not_found");
    const copy_button = document.getElementsByClassName("copy-button");
    const resultado_decodificado = document.getElementsByClassName("resultado-decodificado");
    const resultado = document.getElementById("resultado");

    if (document.getElementById('dc-input').value != "") {

        let letrasCriptografadas = {
            e: 'enter',
            i: 'imes',
            a: 'ai',
            o: 'ober',
            u: 'ufat'
        };

        let novoTexto = '';

        for (let i = 0; i < texto.length; i++) {
            let letra = texto[i];

            if (letrasCriptografadas.hasOwnProperty(letra)) {
            novoTexto += letrasCriptografadas[letra];
            } else {
            novoTexto += letra;
            }
        }

        texto_criptografado = novoTexto
        
        campo_resultado[0].style.display = "inline-block";
        img_404[0].style.display = "none";
        not_found[0].style.display = "none";
        copy_button[0].style.display = "inline-block";
        resultado_decodificado[0].style.display = "inline-block";
        resultado.innerHTML = texto_criptografado;

    } else {
        campo_resultado[0].style.display = "flex";
        img_404[0].style.display = "inline-block";
        not_found[0].style.display = "inline-block";
        copy_button[0].style.display = "none";
        resultado_decodificado[0].style.display = "none";
        resultado.innerHTML = "";
    }
}

function descriptografar(textoCriptografado) {
    const campo_resultado = document.getElementsByClassName("campo-resultado");
    const img_404 = document.getElementsByClassName("img-404");
    const not_found = document.getElementsByClassName("not_found");
    const copy_button = document.getElementsByClassName("copy-button");
    const resultado_decodificado = document.getElementsByClassName("resultado-decodificado");
    const resultado = document.getElementById("resultado");

    if (document.getElementById('dc-input').value != "") {

        let letrasCriptografadas = {
            enter: 'e',
            imes: 'i',
            ai: 'a',
            ober: 'o',
            ufat: 'u'
            };
        
        let novoTexto = '';
        
        let palavras = textoCriptografado.split(/(enter|imes|ai|ober|ufat)/);
    
        for (let i = 0; i < palavras.length; i++) {
        let palavra = palavras[i];
    
        if (letrasCriptografadas.hasOwnProperty(palavra)) {
            novoTexto += letrasCriptografadas[palavra];
        } else {
            novoTexto += palavra;
            }
        }
    
        texto_descriptografado = novoTexto

        campo_resultado[0].style.display = "inline-block";
        img_404[0].style.display = "none";
        not_found[0].style.display = "none";
        copy_button[0].style.display = "inline-block";
        resultado_decodificado[0].style.display = "inline-block";
        resultado.innerHTML = texto_descriptografado;
    } else {
        campo_resultado[0].style.display = "flex";
        img_404[0].style.display = "inline-block";
        not_found[0].style.display = "inline-block";
        copy_button[0].style.display = "none";
        resultado_decodificado[0].style.display = "none";
        resultado.innerHTML = "";
    }
}

function copy(texto) {
    navigator.clipboard.writeText(texto)
}