$(function () {
            $("#key").blur(function () {
                //方法一
                $.get(
                    "${pageContext.request.contextPath}/checkKey_方法1.do",
                    {
                        "key":$("#key").val()
                    },
                    function (data) {
                        $("#err").html(data);
                        if(data.indexOf("key已存在")==-1){
                            $("#sb").attr("disabled",false);
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    }
                );

                //方法二
                $.post(
                    "${pageContext.request.contextPath}/checkKeyJson.do",
                    {
                        "key":$("#key").val()
                    },

                    function (data) {
                        data = data.info;
                        $("#err").html(data);
                        if(data.indexOf("key已存在")==-1){
                            $("#sb").attr("disabled",false);
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    },
                    "json"
                );




            });
        });