var windowElement = document.getElementById('movableWindow');
var isDragging = false;
var mouseOffset = { x: 0, y: 0 };

// Event listeners para el inicio y fin del arrastre
windowElement.addEventListener('mousedown', startDragging);
window.addEventListener('mouseup', stopDragging);

// Función para iniciar el arrastre
function startDragging(event) {
    isDragging = true;
    mouseOffset.x = event.clientX - windowElement.offsetLeft;
    mouseOffset.y = event.clientY - windowElement.offsetTop;
    window.addEventListener('mousemove', dragWindow);
}

// Función para detener el arrastre
function stopDragging() {
    isDragging = false;
    window.removeEventListener('mousemove', dragWindow);
}

// Función para arrastrar la ventana
function dragWindow(event) {
    if (isDragging) {
        windowElement.style.left = (event.clientX - mouseOffset.x) + 'px';
        windowElement.style.top = (event.clientY - mouseOffset.y) + 'px';
    }
}