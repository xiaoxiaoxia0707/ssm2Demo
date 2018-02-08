
    /*--------------------------------------------渲染页面--------------*/
    function getQueryString(name) {
      var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
      var r = window.location.search.substr(1).match(reg);
      if (r != null) {
        return unescape(r[2]);
      }
      return null;
    }

    var StudentId = getQueryString("id");

    $.ajax({
      type: "GET",
      url: "rest/student/find",  //根据id查询记录
      data:{
        StudentId:StudentId
      },
      dataType: "json",
      success:function(data){
        //获取到id=xxx的用户对象
        var student = data.data;
        $("#id").val(student.id);
        $("#name").val(student.name);
        $("#address").val(student.college);
        $("#sex").val(student.specialty);
        //给提交按钮绑定事件
        $("#submitBtn").click(function() {
          updateStudent();
        })

      }
    });
    /*--------------------------------------------渲染页面--------------*/
    function updateStudent(){
      $.ajax({
        type: "POST",
        dataType: "json",
        url: "rest/student/update",  //更新路径
        data: {
            _method: 'PUT',
          StudentId: $("#id").val(),
          StudentName: $("#name").val(),
            StudentCollege: $("#address").val(),
            StudentSpecialty: $("#sex").val()
        },
        success: function(data) {

          window.location.href="rest/student/student";  //跳转到列表页面
        }

      });
    }