function showText() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var occupation = document.getElementById("occupation").value;
    var country = document.getElementById("country").value;

    document.getElementById("show").innerHTML =
        firstName + "<br>" + lastName + "<br>" + occupation + "<br>" + country;
}
