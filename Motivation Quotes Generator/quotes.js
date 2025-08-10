const quotes = [
    "1. The best way to get started is to quit talking and begin doing. -> Example: You’ve been thinking of creating a YouTube channel for months — instead of planning endlessly, record your first video today.",
    "2. Don’t watch the clock; do what it does. Keep going. -> Example: While preparing for your coding interview, don’t keep checking the time — just keep solving problems until you improve.",
    "3. Your limitation—it’s only your imagination. -> Example: You believe you can’t run 5 km, but once you train daily for 2 weeks, you do it easily.",
    "4. Push yourself, because no one else is going to do it for you. -> Example: You want to learn JavaScript deeply — no one will force you, so set your own study plan.",
    "5. Great things never come from comfort zones. -> Example: You take on a challenging project at work even though it scares you — and you end up learning more than ever.",
    "6. Dream big. Start small. Act now. -> Example: You want to build an app with thousands of users, so you start by coding the basic login page today.",
    "7. Work hard in silence. Let success be your noise. -> Example: You quietly prepare for an exam, and on results day, everyone is surprised at your top rank.",
    "8. Failure is the opportunity to begin again more intelligently. -> Example: Your first business idea fails, but you use the lessons learned to make your second one a success.",
    "9. Action is the foundational key to all success. -> Example: You want to learn swimming, so instead of reading about it, you jump into the pool and practice.",
    "10. Small progress each day adds up to big results. -> Example: You write just 1 page of your book daily — in 3 months, you have the whole draft ready.",
    "11. Opportunities don’t happen. You create them. -> Example: You attend networking events, which helps you land a job offer that didn’t exist before.",
    "12. It’s not about perfect. It’s about effort. -> Example: You go to the gym even if you can only work out for 20 minutes — consistency wins.",
    "13. If you want something you’ve never had, you must be willing to do something you’ve never done. -> Example: You’ve never spoken in public, but you volunteer for a presentation to improve your career opportunities.",
    "14. A goal without a plan is just a wish. -> Example: Instead of vaguely saying “I want to be fit,” you create a workout and diet plan.",
    "15. Don’t stop when you’re tired. Stop when you’re done. -> Example: You keep coding until you finish the feature, even though you’re sleepy, so you don’t leave it half-done.",
    "16. The harder you work for something, the greater you’ll feel when you achieve it. -> Example: You spend months learning DSA, and when you crack a big tech interview, the feeling is unmatched.",
    "17. Discipline is the bridge between goals and accomplishment. -> Example: You wake up early every day to study, even when you don’t feel like it.",
    "18. Don’t limit your challenges. Challenge your limits. -> Example: You aim for 20 push-ups but push yourself to do 25, building confidence.",
    "19. Success is not final, failure is not fatal: It is the courage to continue that counts. -> Example: You lose one client for your freelance work but continue marketing, and you land two more.",
    "20. One day or day one. You decide. -> Example: Instead of saying “I’ll start next week,” you begin your coding practice today."
];

document.getElementById("newQuote").addEventListener('click', function() {
    const randomIndex = Math.floor(Math.random() * quotes.length);
    document.getElementById("quote").textContent = quotes[randomIndex];
});
