/**
 * 
 */
  var hamburgerMenuIcon = document.querySelector('.hamburger-menu-icon');
    var menuBox = document.querySelector('.menu-box');

    document.addEventListener('click', function(event) {
      var isClickInsideHamburgerMenu = hamburgerMenuIcon.contains(event.target);
      var isClickInsideMenuBox = menuBox.contains(event.target);

      if (isClickInsideHamburgerMenu) {
        menuBox.style.display = 'block';
      } else if (!isClickInsideMenuBox) {
        menuBox.style.display = 'none';
      }
    });