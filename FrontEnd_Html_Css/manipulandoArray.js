const frutas = [ "Morango" ];

console.log(frutas.length);

frutas.push("Melão");
frutas.push("Melancia");
frutas.push("Caqui");

console.log(frutas.join(" | "));
frutas.pop();
console.log(frutas);

frutas.shift();
console.log(frutas);

