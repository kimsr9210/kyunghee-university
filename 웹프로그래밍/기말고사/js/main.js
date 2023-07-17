$(function () {
    $(document).ready(function () {
        $('.slider').bxSlider({
            mode: 'fade',
            pager: false,
            auto: true,
            speed: '2000'
        });
    });
    $('.bxslider').bxSlider({
        minSlides: 2,
        maxSlides: 3,
        slideWidth: 500,
        slideMargin: 70
    });
  $('.navi').click(function(){
			$('nav').toggleClass('active');
			$('.navi').toggleClass('toggle');
		});
    });
