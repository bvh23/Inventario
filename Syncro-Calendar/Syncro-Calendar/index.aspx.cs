using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Syncro_Calendar
{
    public partial class index : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            Application["indicador"] = "true";
        }

        protected void btningresar_Click(object sender, EventArgs e)
        {
            Response.Redirect("FormUsuarios.aspx");
        }
    }
}