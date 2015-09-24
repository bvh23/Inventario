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
    public partial class Crear : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
            SqlConnection con = new SqlConnection(cadena);
            con.Open();

            SqlDataAdapter ad = new SqlDataAdapter("Select Cedula, Nombres AS 'Nombre y Apellido', Usuario, Contrasena, Area AS 'Area de Trabajo' from usuarios", con);
            DataSet ds = new DataSet();

            ad.Fill(ds, "usuarios");

        }

        protected void btnRegistrar_Click(object sender, EventArgs e)
        {
            try
            {
                string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
                SqlConnection con = new SqlConnection(cadena);

                string ad = "insert into usuarios values(@Cedula, @Nombres, @Usuario, @Contrasena, @Area)";
                SqlCommand cmd = new SqlCommand(ad, con);

                con.Open();
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.Add("@Cedula", SqlDbType.VarChar, 50).Value = txtCedula.Text;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.Add("@Nombres", SqlDbType.VarChar, 50).Value = txtNombres.Text;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.Add("@Usuario", SqlDbType.VarChar, 50).Value = txtUsuario.Text;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.Add("@Contrasena", SqlDbType.VarChar, 50).Value = txtContrasena.Text;
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.Add("@Area", SqlDbType.VarChar, 50).Value = txtArea.Text;

                cmd.ExecuteNonQuery();

                con.Close();

                //mensaje de guardado exitoso.
                string script = @"<script type='text/javascript'> alert('¡Datos guardados!'); </script>";

                ScriptManager.RegisterStartupScript(this, typeof(Page), "alerta", script, false);
            }
            catch (Exception er)
            {
                btnGuardar.Attributes.Add("onclick", "javascript:alert('Error:   ');" + er);
            }
        }

        protected void btnModificar_Click(object sender, EventArgs e)
        {
            //Codigo para mostrar los datos en los TextBox
            string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
            SqlConnection con = new SqlConnection(cadena);

            string ad = "update usuarios set Nombres=@Nombres, Usuario=@Usuario, Contrasena=@Contrasena, Area=@Area where Cedula=@Cedula";
            SqlCommand cmd = new SqlCommand(ad, con);
            con.Open();

            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Cedula", SqlDbType.VarChar, 50).Value = txtCedula.Text;

            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Nombres", SqlDbType.VarChar, 50).Value = txtNombres.Text;
            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Usuario", SqlDbType.VarChar, 50).Value = txtUsuario.Text;
            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Contrasena", SqlDbType.VarChar, 50).Value = txtContrasena.Text;
            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Area", SqlDbType.VarChar, 50).Value = txtArea.Text;

            cmd.ExecuteNonQuery();


            con.Close();


        }

        protected void btnEliminar_Click(object sender, EventArgs e)
        {
            string cadena = "Data Source=BRIAN-PC\\SQLEXPRESS;Initial Catalog=BDRegistro;Integrated Security=True";
            SqlConnection con = new SqlConnection(cadena);

            string ad = "DELETE FROM usuarios WHERE Cedula=@Cedula";
            SqlCommand cmd = new SqlCommand(ad, con);

            con.Open();
            cmd.CommandType = CommandType.Text;
            cmd.Parameters.Add("@Cedula", SqlDbType.VarChar, 50).Value = Convert.ToInt32(txtCedulaElim.Text);

            cmd.ExecuteNonQuery();

            con.Close();
        }
        }
    }
