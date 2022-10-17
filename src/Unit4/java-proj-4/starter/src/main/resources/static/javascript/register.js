const registerForm = document.getElementById("register-form")
const registerUsername = document.getElementById("register-username")
const registerPassword = document.getElementById("register-password")

const headers = {
    'Content-Type': 'application/json'
}

const baseUrl = 'http://localhost:8080/api/v1/users'

const submit = async (e) => {
    console.log('----submit triggered');
    e.preventDefault();
    let body = {
        username: registerUsername.value,
        password: registerPassword.value
    }

    const response = await fetch(baseUrl + "/register", {
        method: "POST",
        body: JSON.stringify(body),
        headers: headers
    }).catch(err => alert("message="+err.message))

    const responseArr = await response.json()

    if (response.status === 200){
        window.location.replace(responseArr[0])
    }
}

registerForm.addEventListener("submit", submit)