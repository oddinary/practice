//window.addEventListener('DOMContentLoaded', function () {
//    document.querySelector('.header').style.display = 'none';
//})

$(function () {
    $('.main_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 2000,
        // 1000 = 1초
        dots: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });

    $('.warning i').on('click', function () {
        $(this).parent().hide();
    })
})

