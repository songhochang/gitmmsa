function doA(){
    alert('누름');
}


var heading = document.querySelector("#heading");
// alert(heading);

heading.onclick = function() {
    heading.style.color = "blue";
    heading.innerHTML = "글자 바뀜";
    heading.style.backgroundColor = "skyblue";
    heading.style.textAlign = "center";
    heading.style.fontSize = "100px";
};

btn.onclick = function(){
    var name = prompt('너의 이름은','이름');
    alert(name);
}