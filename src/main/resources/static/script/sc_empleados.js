window.addEventListener("DOMContentLoaded", function() {
  var loader = document.getElementById("loader");
  var tabla = document.getElementById("miTabla");
  var boton = document.querySelector(".div_button.lef");
  
  setTimeout(function() {
    loader.style.display = "none";
    tabla.classList.remove("hidden");
    boton.classList.remove("hidden");
  }, 2000);
});
