function convertirMayusculas(elemento) {
    elemento.value = elemento.value.toUpperCase();
}

function convertirMinusculas(elemento) {
    elemento.value = elemento.value.toLowerCase();
}

function capitalizarTexto(elemento) {
  var campo = elemento;
  var palabras = campo.value.split(" ");
  var resultado = "";
  
  for (var i = 0; i < palabras.length; i++) {
    var palabra = palabras[i].toLowerCase();
    if (palabra !== "" && palabra !== "del") {
      palabra = palabra.charAt(0).toUpperCase() + palabra.slice(1);
    }
    resultado += palabra + " ";
  }
  // Restaurar espacios entre palabras
  var ultimoCaracter = campo.value.slice(-1);
  if (ultimoCaracter === " ") {
    resultado += " ";
  }
  campo.value = resultado.trim();
}

function limitarLongitud(elemento) {
    var campo = elemento;
    if (campo.value.length > 10) {
        advertencia.style.display = "block";
        campo.value = campo.value.slice(0, 10);advertencia.style.display = "block";
    }else{
        advertencia.style.display = "none";
    }
}

