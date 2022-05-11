$(function () {
    //////////////////////////////////////////////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp();
    })

    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        current.addClass('on').siblings().removeClass('on');
    })

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,

    })

    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('pause')
    })
    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('play')
    })

    $("#myMovie").YTPlayer({
        videoURL: 'https://youtu.be/s36WRbd3A_Y', containment: '.youtube', autoPlay: true, mute: true, startAt: 0, opacity: 1, showControls: false, playOnlyIfVisible: true
    });

    $('.youtube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPause();
    })
    $('.youtube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPlay();
    })

    $('.sub_slider').slick({
        arrows: false,
        infinite: true,
        slidesToShow: 5,
        slidesToScroll: 1,
        centerMode: true,
        dots: true,
        pauseOnFocus: false,
        autoplay: true,
    });


    $('.product .s_left').on('click', function () {
        $('.sub_slider').slick('slickPrev');
    })
    $('.product .s_right').on('click', function () {
        $('.sub_slider').slick('slickNext');
    })

    $('.tab_link>li').on('click', function () {
        var idx = $(this).index();
        $(this).addClass('on').siblings().removeClass('on');
        $('.tab_content>li').eq(idx).addClass('on').siblings().removeClass('on');
    })

    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        if (lik) window.open(lik);
    })

    //////////////////////////////////////////////////////////////////////////
})