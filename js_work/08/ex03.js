let arr = [1,2,3];
let brr = [4,5,6];
let myarr = [{age:20,name:"홍길동"},{age:30,name:"고길동"},{age:40,name:"하길동"}];

console.log(arr+brr);
console.log(arr.concat(brr));

const crr = arr.filter((n)=>n%2==0);
console.log(crr)

const filterArr = myarr.filter(item => item.age>20);
console.log(filterArr);