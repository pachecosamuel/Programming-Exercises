var pessoa = {
    nome: "Samuel",
    sobrenome: "Pacheco",
    idade: 24,
    endereco:{
        rua: "Granja Brasil",
        ap: 120,
        numero: 1271,
        cidade: "Petropolis"
    },
    gritar: function(){
        console.log("Milionário e muito mais")
    }
}

// EX1
// const {nome, gritar,endereco} = pessoa;
// const {cidade, numero} = endereco;
// console.log(nome);
// console.log(cidade, endereco);

// EX2
const {numero} = pessoa.endereco;
console.log(numero);
