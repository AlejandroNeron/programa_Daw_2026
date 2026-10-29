let nombres = ['Pedro', 'Juan', 'Elena', 'Antonio', 'Maria'];

/**
 * Calculates the length of each name.
 *
 * @param {string[]} nombres - Array containing the names.
 * @returns {number[]} Array containing the length of each name.
 */
function calcularLongitudes(nombres) {
    return nombres.map(nombre => nombre.length);
}

/**
 * Calculates the total number of characters in all names.
 *
 * @param {string[]} nombres - Array containing the names.
 * @returns {number} Total number of characters.
 */
function calcularSumaLongitudes(nombres) {
    return nombres.reduce((acumulador, nombre) => {
        return acumulador + nombre.length;
    }, 0);
}

console.log(calcularLongitudes(nombres));
console.log(calcularSumaLongitudes(nombres));