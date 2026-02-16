class Student {
  constructor(name, marks) {
    this.name = name;
    this.marks = marks;
  }

  result() {
    if (this.marks >= 50) {
      return this.name + " passed!";
    } else {
      return this.name + " failed.";
    }
  }
}

let s1 = new Student("Alice", 80);
let s2 = new Student("Bob", 35);

console.log(s1.result());   // Alice passed!
console.log(s2.result());   // Bob failed.