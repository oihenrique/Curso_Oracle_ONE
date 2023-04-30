function criptografar(palavra) {
    let letrasCriptografadas = {
        e: 'enter',
        i: 'imes',
        a: 'ai',
        o: 'ober',
        u: 'ufat'
      };

    let novaPalavra = '';

    for (let i = 0; i < palavra.length; i++) {
        let letra = palavra[i];

        if (letrasCriptografadas.hasOwnProperty(letra)) {
        novaPalavra += letrasCriptografadas[letra];
        } else {
        novaPalavra += letra;
        }
    }

    return novaPalavra;
    
}

console.log(criptografar('gato'))
