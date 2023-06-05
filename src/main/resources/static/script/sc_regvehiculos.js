function enviarFormulario() {
    // Obtener los datos del primer formulario
    var form1 = document.getElementsByTagName('form1')[0];
    var marca = form1.elements['name'][0].value;
    var modelo = form1.elements['name'][1].value;
    var nplaca = form1.elements['name'][2].value;
    var tipoVehiculo = form1.elements['tipo_vehiculo'].value;

    // Obtener los datos del segundo formulario
    var form2 = document.getElementsByTagName('form2')[1];
    var email = form2.elements['name'][0].value;
    var name = form2.elements['name'][1].value;
    var password = form2.elements['name'][2].value;
    var gender = form2.elements['gender'].value;

    // Agregar campos ocultos al segundo formulario
    var inputMarca = document.createElement('input');
    inputMarca.type = 'hidden';
    inputMarca.name = 'vehi_marca';
    inputMarca.value = marca;
    form2.appendChild(inputMarca);

    var inputModelo = document.createElement('input');
    inputModelo.type = 'hidden';
    inputModelo.name = 'vehi_modelo';
    inputModelo.value = modelo;
    form2.appendChild(inputModelo);

    var inputNplaca = document.createElement('input');
    inputNplaca.type = 'hidden';
    inputNplaca.name = 'vehi_nplaca';
    inputNplaca.value = nplaca;
    form2.appendChild(inputNplaca);

    var inputTipoVehiculo = document.createElement('input');
    inputTipoVehiculo.type = 'hidden';
    inputTipoVehiculo.name = 'tipo_vehiculo';
    inputTipoVehiculo.value = tipoVehiculo;
    form2.appendChild(inputTipoVehiculo);

    // Enviar el segundo formulario
    form2.submit();
  }