using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;

namespace Syncro_Calendar
{
    public partial class FormUsuarios : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
            SqlConnection con = new SqlConnection(cadena);
            con.Open();


            SqlDataAdapter ad = new SqlDataAdapter("Select Cedula, Nombres AS 'Nombre y Apellido', Usuario, Contrasena, Area AS 'Area de Trabajo' from usuarios", con);
            DataSet ds = new DataSet();

            ad.Fill(ds, "usuarios");

            DV_Ver.DataSource = ds;
            DV_Ver.DataBind();
            con.Close();

            
                if ((Application["nombres"] != null) && (Application["area"] != null) && (Application["usuario"] != null))
                {
                   // Response.Write("<tr><td>" + Application["nombres"] + "</td><td>"+Application["usuario"]+"</td><td>"+Application["area"]+"</td></tr>");
                }

 
        }

        protected void btnMostrar_Click(object sender, EventArgs e)
        {
            string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
            SqlConnection con = new SqlConnection(cadena);
            con.Open();

            SqlDataAdapter ad = new SqlDataAdapter("Select Cedula, Nombres AS 'Nombre y Apellidos', Usuario, Contrasena, Area AS 'Area de Trabajo' from usuarios", con);
            DataSet ds = new DataSet();

            ad.Fill(ds, "usuarios");

            DV_Ver.DataSource = ds;
            DV_Ver.DataBind();
            con.Close();
        }

        protected void btnCrear_Click(object sender, EventArgs e)
        {
            Response.Redirect("Crear.aspx");
        }



    }
}