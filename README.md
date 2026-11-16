# Tenant Management System
An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
ui/ Activities, Fragments and TenantViewModel (UI layer)
data/ Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
Screens → TenantViewModel (LiveData) → TenantRepository → Room

## Team
| Stage | Member                           | Admission No.       | Pull request |
|---|----------------------------------|---------------------|--|
| 1 Lead | [Hindu Nalubega]                 | [170448]            | [https://github.com/Nalubega789/Tenant-Management-System/commit/a876d99648130974ec4b42b5ddae470cf27750b2] |
| 2 ViewModel | [Denzel Male Robert]             | [169074]         [https://github.com/Nalubega789/Tenant-Management-System/pull/1] |
| 3 Room | [Raphael Mbuva]                  | [192045]            | [https://github.com/Nalubega789/Tenant-Management-System/pull/2] |
| 4 Screens | [Alvin Boro and Ivanna Githinji] | [190399 and 190804] | [https://github.com/Nalubega789/Tenant-Management-System/pull/4] |
| 5 Data integration | [Bakhita Muturi]                 | [192282]            | [https://github.com/Nalubega789/Tenant-Management-System/pull/5] |
| 6 Release | [Terryane Sigei]                 | [190379]            | [https://github.com/Nalubega789/Tenant-Management-System/pull/6] |