Array.prototype.search=function (target) {
    for(var i=0;i<this.length;i++){
        if(this[i]==target){
            return i;
        }
    }
    return -1;
};
Array.prototype.max=function () {
    var max=this[0];
    for(var i=0;i<this.length;i++){
        if(this[i]>max){
            max=this[i];
        }
    }
    return max;
};