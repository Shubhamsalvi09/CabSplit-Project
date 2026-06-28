async function createRide() {
    const ride = {
        name: document.getElementById("name").value,
        phone: document.getElementById("phone").value,
        pickup: document.getElementById("pickup").value,
        dropLocation: document.getElementById("dropLocation").value,
        time: document.getElementById("time").value
    };

    const response = await fetch("/api/rides", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(ride)
    });

    const matches = await response.json();
    const matchDiv = document.getElementById("matches");
    matchDiv.innerHTML = "";

    if (matches.length === 0) {
        matchDiv.innerHTML = "<p>No matching passenger found yet.</p>";
        return;
    }

    matches.forEach(match => {
        matchDiv.innerHTML += `
            <div class="match-card">
                <h3>${match.name}</h3>
                <p><b>Phone:</b> ${match.phone}</p>
                <p><b>Pickup:</b> ${match.pickup}</p>
                <p><b>Drop:</b> ${match.dropLocation}</p>
                <p><b>Time:</b> ${match.time}</p>
            </div>
        `;
    });
}