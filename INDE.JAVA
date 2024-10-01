// JavaScript for Eram Public College

// Function to scroll to a specific section
function scrollToSection(sectionId) {
    const section = document.getElementById(sectionId);
    if (section) {
        section.scrollIntoView({ behavior: 'smooth' });
    }
}

// Function to send email via the contact form
function sendEmail(event) {
    event.preventDefault(); // Prevent default form submission
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;

    // Create a mailto link to send the email
    const mailtoLink = `mailto:Mohdharizsiddiqui@gmail.com?subject=Message from ${name}&body=${encodeURIComponent(message)}\n\nFrom: ${email}`;
    window.location.href = mailtoLink; // Open the email client with the pre-filled message
}

// Event listener for the Explore More button
document.querySelector('.hero button').addEventListener('click', () => {
    window.location.href = 'https://erampubliccollege.in/'; // Redirect to the official website
});
