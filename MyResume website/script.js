document.addEventListener("DOMContentLoaded", () => {
  const header = document.querySelector("header");
  let opacity = 0;
  header.style.opacity = opacity;

  const fadeIn = () => {
    opacity += 0.02;
    if (opacity <= 1) {
      header.style.opacity = opacity;
      requestAnimationFrame(fadeIn);
    }
  };

  requestAnimationFrame(fadeIn);
});
