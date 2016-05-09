/**
 * Created by zhaoyp on 16/4/11.
 */

$(function() {

});

function cmainFrame() {
    var hmain = document.getElementById("mainFrame");
    var bheight = document.documentElement.clientHeight;
    hmain.style.width = '100%';
    hmain.style.height = (bheight - 51) + 'px';
}
function menuOnclick(mUrl){
    var hmain = document.getElementById("mainFrame");
    hmain.src = mUrl;
}