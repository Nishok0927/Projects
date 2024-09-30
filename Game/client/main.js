var Enterrednumber = document.getElementById("Enterrednumber");
var Result = document.getElementById("result");
var randomNumber = Math.floor(Math.random() * 8) + 1;
var chances = document.getElementById("Vaaipu");
var tchances = 5;

function check() {
  var enterredNumber = Enterrednumber.value;

  if (enterredNumber === "") {
    Result.textContent = "Please enter a number!";
    return;
  }

  if (isNaN(enterredNumber) || enterredNumber >= 9) {
    Result.textContent = "Please enter a valid number!";
    return;
  }
  var enterredNumber = parseInt(Enterrednumber.value);
  if (randomNumber == enterredNumber) {
    Result.textContent = "Right!";
    alert("Congratulations!You Won!!");
  } else {
    if (tchances > 0) {
      tchances = tchances - 1;
      chances.textContent = "Score:" + tchances;
      Result.textContent = "Wrong!";
    }
    if (tchances <= 0) {
      alert("You lost the game..your chances are over!!");
      Result.textContent = "The correct number was " + randomNumber;
    }
  }
}
