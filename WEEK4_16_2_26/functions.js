function isEven(num) {
  if (num % 2 === 0) {
    return "Even";
  } else {
    return "Odd";
  }
}

console.log(isEven(4));    // Even
console.log(isEven(7));    // Odd
console.log(isEven(10));   // Even