let input = document.getElementById("input");
let submit = document.getElementById("submit");
let list = document.getElementById("list");
let final = document.getElementById("final");
Arrays = new Array();
let element = submit.addEventListener("click", (event) => {
  if (input.value != "") {
    Arrays.push(input.value);
    list.innerHTML +=
      '<li id="' +
      (Arrays.length - 1) +
      '"><button onclick="result(' +
      (Arrays.length - 1) +
      ')">' +
      input.value +
      "</li>";
    input.value = "";
  } else {
    input.placeholder = "Please enter the value ";
  }
});
function result(id) {
  final.innerHTML += "<li>" + Arrays[id] + "</li>";
  document.getElementById(id).style.display = "none";
}
