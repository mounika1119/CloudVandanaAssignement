function submitForm() {
    const form = document.getElementById("surveyForm");

    if (form.checkValidity()) {
        const firstName = document.getElementById("firstName").value;
        const lastName = document.getElementById("lastName").value;
        const dob = document.getElementById("dob").value;
        const country = document.getElementById("country").value;
        const genderElements = document.getElementsByName("gender");
        const gender = [...genderElements].filter(element => element.checked).map(element => element.value);
        const profession = document.getElementById("profession").value;
        const email = document.getElementById("email").value;
        const mobile = document.getElementById("mobile").value;

        const result = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dob}\nCountry: ${country}\nGender: ${gender.join(", ")}\nProfession: ${profession}\nEmail: ${email}\nMobile Number: ${mobile}`;

        alert(result);
        form.reset();
    }

    return false;
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}