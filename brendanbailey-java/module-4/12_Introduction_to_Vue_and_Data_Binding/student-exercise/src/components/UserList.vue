<template>
  <div class='containers'>
  <table id="tblUsers">
    <thead>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
        <th>Actions</th>
      </tr>
    </thead>
   
    <tbody>
      <tr>
        <td>
          <input type="text" id="firstNameFilter" v-model="filter.firstName" />
        </td>
        <td>
          <input type="text" id="lastNameFilter" v-model="filter.lastName" />
        </td>
        <td>
          <input type="text" id="usernameFilter" v-model="filter.username" />
        </td>
        <td>
          <input type="text" id="emailFilter" v-model="filter.emailAddress" />
        </td>
        <td>
          <select id="statusFilter" v-model='filter.status'>
            <option value>Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
          </select>
        </td>
      </tr>
      <tr
      v-for='user in filteredList'
      v-bind:key='user.id'
      v-bind:class="{disabled: user.status === 'Disabled'}"
      >
      <!-- user listing goes here -->
      <tr class="list" v-for="aUser in users" v-bind:key="aUser">
        <td>{{aUser.firstName}}</td>
        <td>{{aUser.lastName}}</td>
        <td>{{aUser.username}}</td>
        <td>{{aUser.emailAddress}}</td>
        <td>{{aUser.status}}</td>
        <td>
          <button class='btnEnableDisable'>Enable or Disable</button>
        </td>
      </tr>
    </tbody>
  </table>
  <div class='all-actions'>
    <button>Enable User</button>
    <button>Disable Users</button>
    <button>Delete Users</button>
  </div>

  <button>Add New User</button>

  <form id='frmAddNewUser'>
    <div class='field'>
      <label for='firstName'>First Name:</label>
      <input type='text' name='firstName' />
    </div>
    <div class='field'>
      <label for='lastName'>Last Name:</label>
      <input type='text' name='lastName' />
    </div>
    <div class='field'>
      <label for='lastName'>Username:</label>
      <input type='text' name='username' />
    </div>
    <div class='field'>
      <label for='lastName'>Email Address:</label>
      <input type='text' name='emailAddress' />
    </div>
    <button type='submit' class='btn save'>Save User</button>
  </form>
  </div>
</template>

<script>
export default {
  name: "user-list",
  data() {
    return {
      users: [
        {
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active",
        },
        {
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active",
        },
        {
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Disabled",
        },
        {
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active",
        },
        {
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active",
        },
        {
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Disabled",
        },
      ],
      filter: {
        firstName: "",
        lastName: "",
        userName: "",
        emailAddress: "",
        status: "",
      },
    }; // end of data() return
  }, // end of data()
  computed: {
    filteredList() {
      return this.users.filter((aUser)=> {
        return aUser.firstName.toLowerCase().includes(this.filter.firstName.toLowerCase())
        && aUser.lastName.toLowerCase().includes(this.filter.lastName.toLowerCase())
        && aUser.username.toLowerCase().includes(this.filter.username.toLowerCase())
        && aUser.emailAddress.toLowerCase().includes(this.filter.emailAddress.toLowerCase())
        && aUser.status.includes(this.filter.status)
      });
    }
  }
};
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}
</style>
