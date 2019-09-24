const slideList = [{
 img: "/img/slider/img1.jpg",
 text: 'Obrazek 1'
},
{
 img: "/img/slider/img2.jpg",
 text: 'Obrazek 2'
},
{
 img: "/img/slider/img3.jpg",
 text: 'Obrazek 3'
},
 {
  img: "/img/slider/img4.jpg",
  text: 'Obrazek 4'
 },
 {
  img: "/img/slider/img5.jpg",
  text: 'Obrazek 5'
 },
 {
  img: "/img/slider/img6.jpg",
  text: 'Obrazek 6'
 },
 {
  img: "/img/slider/img7.jpg",
  text: 'Obrazek 7'
 },
 {
  img: "/img/slider/img8.jpg",
  text: 'Obrazek 8'
 },
 {
  img: "/img/slider/img9.jpg",
  text: 'Obrazek 9'
 },
 {
  img: "/img/slider/img10.jpg",
  text: 'Obrazek 10'
 },
 {
  img: "/img/slider/img11.jpg",
  text: 'Obrazek 11'
 },
 {
  img: "/img/slider/img12.jpg",
  text: 'Obrazek 12'
 }];

const image = document.querySelector('img.slider');
const h1 = document.querySelector('h1.slider');
const dots = [...document.querySelectorAll('.dots span')]

const time = 3000;
let active = 0;
const changeSlide
= () => {
 active++;
 if (active === slideList.length) {
  active = 0;
 }
 image.src = slideList[active].img;
 h1.textContent = slideList[active].text;
 changeDot()
}

window.onload = changeSlide;
let indexInterval = setInterval(changeSlide, time)





