
//Cookie
const userId = document.cookie.split("=")[1];

//Requests
const headers = {
    'Content-Type': 'application/json'
};
const baseUrl = 'http://localhost:8080/api/v1/notes';

//Event Listeners
const addNoteForm = document.getElementById("add-note-form");
addNoteForm.addEventListener("submit", addNote);
const updateNoteButton = document.getElementById("update-note-button");
updateNoteButton.addEventListener("click", (e)=>{
    let noteId = e.target.getAttribute('data-note-id');
    updateNoteById(noteId);
});


getNotes(userId);



function logout() {
    for(let i in document.cookie.split(";")){
        console.log(document.cookie = /^[^=]+/.exec(document.cookie.split(";")[i])[0]+"=;expires=Thu, 01 Jan 1970 00:00:00 GMT")
    }
}

async function addNote (e) {
    e.preventDefault()

    let body = {
        body: document.getElementById("add-note-text").value
    }

    const response = await fetch(`${baseUrl}/addNote/${userId}`, {
        method: "POST",
        body: JSON.stringify(body),
        headers: headers
    }).catch(err => console.log(err.message))

    if(response.status === 200) return getNotes(userId);
}

async function deleteNote(noteId){
    await fetch(`${baseUrl}/${noteId}`, {
            method: "DELETE",
            headers: headers
    }).catch(err => console.log(err.message))
    return getNotes(userId);
}

async function getNoteById(noteId){
    await fetch(`${baseUrl}/${noteId}`, {
                method: "GET",
                headers: headers
    }).then(res=>res.json())
        .then(data => openEditModal(data))
        .catch(err => console.log(err.message))
}

function openEditModal(data){
    let noteText = document.getElementById("edit-body");
    noteText.innerText = data.body;
    let updateBtn = document.getElementById("update-note-button")
    updateBtn.setAttribute('data-note-id', data.id);
}

async function updateNoteById(noteId){
console.log(noteId)
    let noteText = document.getElementById("edit-body");
    let body = {
        id: noteId,
        body: noteText.value
    }
    await fetch(`${baseUrl}`, {
        method: "PUT",
        body: JSON.stringify(body),
        headers: headers
    }).catch(err => console.log(err.message))
    return getNotes(userId);
}

async function getNotes(userId) {
    let noteContainer = document.getElementById("note-container")
    console.log(userId);
    await fetch(`${baseUrl}/getNotes/${userId}`, {
            method: "GET",
            headers: headers
    }).then(res=>res.json())
        .then(data=>{
            noteContainer.innerHtml = '';
            console.log(noteContainer);
            if(data!= null) console.log(data)
            data.forEach((d)=>{
                let noteCard = document.createElement("div")
                noteCard.innerHTML = `
                    <div class="card">
                        <div class="card-body">
                            <p class="card-text">${d.body}</p>
                            <button class="btn btn-warning" data-bs-toggle="modal" data-bs-target="#edit-modal"  onclick="getNoteById(${d.id})">Edit Note</button>
                            <button type="button" class="btn btn-danger" onclick="deleteNote(${d.id})">Delete Note</button>
                        </div>
                    </div>
                `
                noteContainer.append(noteCard);
            })
        }).catch(err => console.log(err.message))
}