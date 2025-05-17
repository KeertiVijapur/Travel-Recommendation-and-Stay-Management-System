function handleSubmit(event) {
    event.preventDefault(); // Prevent form submission
    // Perform form validation and AJAX request as needed
    // Example:
    const formData = new FormData(event.target);
    const username = formData.get('username');
    const password = formData.get('password');
    const email = formData.get('email');
    // Example AJAX request using fetch API
    fetch('register', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username, password, email }),
    })
    .then(response => response.json())
    .then(data => {
        // Handle response from server
        console.log('Registration successful:', data);
        // Redirect or update UI as needed
    })
    .catch(error => {
        console.error('Error:', error);
        // Handle errors
    });
}

// Example function to load recommendations
function loadRecommendations() {
    // Example AJAX request to fetch recommendations
    fetch('recommend', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json',
        },
    })
    .then(response => response.json())
    .then(data => {
        // Process recommendation data and update UI
        console.log('Recommendations:', data);
        // Example: Update HTML to display recommendations
        const recommendationList = document.getElementById('recommendation-list');
        data.forEach(destination => {
            const listItem = document.createElement('li');
            listItem.textContent = destination.name;
            recommendationList.appendChild(listItem);
        });
    })
    .catch(error => {
        console.error('Error:', error);
        // Handle errors
    });
}

// Example event listeners
document.addEventListener('DOMContentLoaded', function() {
    // Add event listener for form submission
    const registerForm = document.getElementById('register-form');
    if (registerForm) {
        registerForm.addEventListener('submit', handleSubmit);
    }
    
    // Example: Load recommendations on page load
    loadRecommendations();
});
